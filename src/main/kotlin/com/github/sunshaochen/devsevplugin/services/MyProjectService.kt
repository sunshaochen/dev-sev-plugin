package com.github.sunshaochen.devsevplugin.services

import com.github.sunshaochen.devsevplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
