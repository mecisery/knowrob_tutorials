cmake_minimum_required(VERSION 2.8.3)
project(knowrob_basics_tutorial)


find_package(catkin REQUIRED COMPONENTS knowrob_maps knowrob_actions)

catkin_package(
    DEPENDS  knowrob_maps knowrob_actions
)
