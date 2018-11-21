#  testing

```

http http://localhost:8080/courses title="MSA 과정" minEnrollment=10 maxEnrollment=100 duration=3 unitPrice=100
http http://localhost:8080/clazzes instructorName="장진영" title="test"
http PATCH http://localhost:8080/clazzes/2 course="http://localhost:8080/courses/1"
http "http://localhost:8080/clazzes/2/course"     # 기대값: MSA 과정의 내용이 나타나야 함   실패시:  404
http "http://localhost:8080/clazzes/2"            # 기대값: title="MSA 과정의 강의[강사: 장진영]"   실패시:  title="test"

```
