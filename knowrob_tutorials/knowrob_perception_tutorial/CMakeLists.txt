##############################################################################
# CMake
##############################################################################

cmake_minimum_required(VERSION 2.8.3)
project(knowrob_perception_tutorial)

##############################################################################
# Catkin
##############################################################################

find_package(catkin REQUIRED COMPONENTS rosjava_build_tools rosprolog knowrob_common)

# Set the gradle targets you want catkin's make to run by default, e.g.
#   catkin_rosjava_setup(installApp)
# Note that the catkin_create_rosjava_xxx scripts will usually automatically
# add tasks to this for you when you create subprojects.
#catkin_rosjava_setup(installApp publishMavenJavaPublicationToMavenRepository writeClasspath)
catkin_rosjava_setup(installDist publishMavenJavaPublicationToMavenRepository writeClasspath)

catkin_package(
)

##############################################################################
# Installation
##############################################################################

# Change this to match the maven group name you have specified in the 
# allprojects closure the root build.gradle
install(DIRECTORY ${CATKIN_DEVEL_PREFIX}/${CATKIN_GLOBAL_MAVEN_DESTINATION}/org/knowrob/${PROJECT_NAME}/ 
        DESTINATION ${CATKIN_GLOBAL_MAVEN_DESTINATION}/org/knowrob/${PROJECT_NAME})
