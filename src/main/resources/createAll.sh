for f in *.json
do
 echo processing $f
 curl http://localhost:8080/speakers -i -H "Content-type: application/json" -d @$f
done