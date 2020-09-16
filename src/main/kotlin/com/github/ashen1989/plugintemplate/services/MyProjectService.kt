package com.github.ashen1989.plugintemplate.services

import com.intellij.openapi.project.Project
import com.github.ashen1989.plugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
