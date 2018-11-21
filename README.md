#  testing

```

http http://localhost:8087/courses title="MSA 과정" minEnrollment=10 maxEnrollment=100 duration=3 unitPrice=100
http http://localhost:8087/clazzes instructorName="장진영" title="test"
http PATCH http://localhost:8087/clazzes/2 course="http://localhost:8087/courses/1"
http "http://localhost:8087/clazzes/2/course"
http "http://localhost:8087/clazzes/2"

```