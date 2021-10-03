from django.shortcuts import render
from .form import StudentRegistration
from .models import User
from django.http import JsonResponse
from django.views.decorators.csrf import csrf_exempt
# Create your views here.
def home(request):
    fm=StudentRegistration()
    stud=User.objects.all()
    return render(request, 'enroll/home.html',{'form':fm,'stu':stud})

@csrf_exempt
def save_data(request):
    print("hello")
    if request.method == "POST":
        form=StudentRegistration(request.POST)
        if form.is_valid():
            name=request.POST['name']
            email=request.POST['email']
            password=request.POST['password']
            usr=User(name= name, email= email, password=password)
            usr.save()
            st=User.objects.count()
            l=User.objects.all()[st-1]
            kl=l.id
            
         
            return JsonResponse({'status':'Save','id':kl})
    else:
        return JsonResponse({'status':0})
