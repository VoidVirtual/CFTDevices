# CFTDevices

 Simple CRUD server application for several electronic devices types, such as:
 
 Laptops
 
 Desktops
 
 Monitors
 
 Hard Drive Disks
  
# Requirements

Maven 3.8.2 or greater

Java 11 or greater

# Build and Launch

cd $projectDirectory

mvn clean package

mvn spring-boot:run

# API

GET /laptops - get all laptops

GET /hard-drives - get all hard drive disks

GET /monitors - get all monitors

GET /desktops - get all desktops

GET /devices/{id} - get the device with provided identificator


GET /$deviceType/{id} - get the deivce of the specific type with provided identificator

    Non-existent id - 404 NOT_FOUND
    
POST /$deviceType/create - create a new device of the $deviceType. Requires a json in the request body

    Negative price - 400 BAD_REQUEST
    Negative display length - 400 BAD_REQUEST
    Negative capacity - 400 BAD_REQUEST
    Blank or null field - 400 BAD_REQUEST
    Existing serial number - 400 BAD_REQUEST

PUT /$deviceType/{id}/edit  -  edit the device of provided identificator. Requieres a json in the request body

For exceptional behaviour see:

    GET /$deviceType/{id} 
    POST /
DELETE /$devceType/{id}/delete - removes the device with provided identificator.

    Non-existent id -  nothing happens

