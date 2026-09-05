package com.example.hi_snr_computational_imaging


//A place for a custom imaging script to be specified using methods from CameraMethods.kt
fun customImagingScript(camera2Controller: Camera2Controller){
        //example usage:
    //camera2Controller.setISO(500)
    //camera2Controller.saveRaw("test")



    //example focal sweep:
    /*
    camera2Controller.startFocalSweep(
        1.0f,   //focus step in diopters. starts at 0 diopters and increases for every image captured.
        300     //delay between focus change and capture, in ms

        //as noted in the documentation, all images captured during the sweep are saved to the app images folder
        //and given the default output name in the format msElapsed_focus_diopters.dng. See GitHub for more.
    )
    */
}

