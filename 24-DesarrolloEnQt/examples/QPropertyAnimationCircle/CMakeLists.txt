cmake_minimum_required(VERSION 3.16)

project(QPropertyAnimationCircle LANGUAGES CXX)

set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

find_package(Qt6 REQUIRED COMPONENTS Widgets)
qt_standard_project_setup()

qt_add_executable(QPropertyAnimationCircle
    animatedrect.cpp
    animatedrect.h
    main.cpp

)

target_link_libraries(QPropertyAnimationCircle
    PRIVATE Qt6::Widgets
)
