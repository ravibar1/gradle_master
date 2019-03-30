# gradle_master
Gradle Helper Project

#Key Files
1. build.gradle
2. settings.gradle
3. gradle-wrapper.properties
4. Final jar will be collected in **build/libs/<YourProject.jar>**


#####Execute Tasks
 * gradle task wrapper
 * gradle task init
 * gradle task build
 
 Notes
 -----
 
 1) Custom tasks will be under Tasks--> Others --> 'Your task'
 2) You can run test tasks after build by extending test task
 
 
 
 #File Operations
 
 ##Copy Task
 
 ###Copy Specific File
 
 ~~~
task copySpecificFile(type: Copy){
    from 'src/main/resources/res1'
    into 'src/test/resources/'
}
 ~~~
 
 ###Copy All File
 
 ~~~
task copyAllFiles(type: Copy){
    from 'src/main/resources/'
    into 'src/test/resources/'
}
 ~~~
 
 