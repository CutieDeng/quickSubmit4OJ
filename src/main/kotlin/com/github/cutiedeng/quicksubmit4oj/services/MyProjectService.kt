package com.github.cutiedeng.quicksubmit4oj.services

import com.intellij.openapi.project.Project
import com.github.cutiedeng.quicksubmit4oj.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
