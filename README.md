#  testing

```
sudo vi /etc/hosts

(아래 추가)
127.0.0.1       calendar

(저장)
```

```
http http://localhost:8087/courses title="MSA 과정" minEnrollment=10 maxEnrollment=100 duration=3 unitPrice=100
http http://localhost:8087/clazzes instructorName="장진영" title="test" course="http://localhost:8080/courses/1"

http localhost:8088/schedules  # 기대값: 강사 장진영의 스케쥴이 하나 추가되어야 함.
```
