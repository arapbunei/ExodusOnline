package com.example.exodusonline.pf


data class PfClasses(val name:String,
                      val desc:String,
                      val grade:String,
                      val age:Int,
                      val color:String)

val classes = listOf(

    PfClasses("Little Lamb","Woods Voyager","Nine",14/15,"Burgundy"),
    PfClasses("Early Bird","Explorer Guide","Ten",15/16,"Gold"),
    PfClasses("Busy Bee","Leader","Leadership",18,"Gold"),
    PfClasses("Sunbeam","Woods Voyager","Nine",14/15,"Burgundy"),
    PfClasses("Builder","Explorer Guide","Ten",15/16,"Gold"),
    PfClasses("Helping Hand","Leader","Leadership",18,"Gold"),

    PfClasses("Friend","Nature's friend","Five",10/11,"Blue"),
    PfClasses("Companion","Excursion Companion","Six",11/12,"Red"),
    PfClasses("Explorer","Field and Forest's Explorer","Seven",12/13,"Green"),
    PfClasses("Ranger","New Frontiers Ranger","Eight",13/14,"Silver"),
    PfClasses("Voyager","Woods Voyager","Nine",14/15,"Burgundy"),
    PfClasses("Guide","Explorer Guide","Ten",15/16,"Gold"),
    PfClasses("MasterGuide","Leader","Leadership",18,"Gold"),

    PfClasses("Ambassador","Woods Voyager","Nine",14/15,"Burgundy"),
    PfClasses("Young Adults","Explorer Guide","Ten",15/16,"Gold"),
    PfClasses("Public Campus Ministry","Leader","Leadership",18,"Gold"),

    PfClasses("Senior Youth Leadership","Woods Voyager","Nine",14/15,"Burgundy"),

)