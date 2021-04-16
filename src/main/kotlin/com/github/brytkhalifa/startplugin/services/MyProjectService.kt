package com.github.brytkhalifa.startplugin.services

import com.github.brytkhalifa.startplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
