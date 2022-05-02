package com.app.welcomescreen
/*
Ngonidzaishe Erica Chipato
218327315
Practical 03
 */

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ModuleView(): ViewModel() {
    val modulesList : MutableLiveData <List<ModulesData>> by lazy{
        MutableLiveData <List<ModulesData>> ()
    }
    private var moduleList : ArrayList <ModulesData>
    init {
        moduleList = ArrayList ()
        getModuleLists()
    }

    private fun getModuleLists(){
        fetchList()
        modulesList.value = moduleList

    }

    private fun fetchList() {
        moduleList.add(ModulesData(R.drawable.adp,"Application Development Practice 3",
            "Practical","Year round"))
        moduleList.add(ModulesData(R.drawable.adt,"Application Development Theory 3",
            "Theory","Year round"))
        moduleList.add(ModulesData(R.drawable.its,"Information Systems 3",
            "Practical","Year round"))
        moduleList.add(ModulesData(R.drawable.pfp,"Professional Practice 3",
            "Theory","Semester"))
        moduleList.add(ModulesData(R.drawable.prm,"Professional Management 3",
            "Theory","Semester"))
        moduleList.add(ModulesData(R.drawable.jet,"ICT Elective 3",
            "Practical","Semester"))
        moduleList.add(ModulesData(R.drawable.prp,"Professional Presentation 3",
            "Theory","Year round"))
        moduleList.add(ModulesData(R.drawable.prt,"Project 3",
            "Practical","Year round"))
    }
}