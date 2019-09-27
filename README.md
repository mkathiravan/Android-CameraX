# Android-CameraX

CameraX structure
CameraX is a use case based API, it has abstracted 3 main handles which you can use to interact with the camera: Preview, Image analysis and Image capture. Choosing which use case(s) to use depends on what you intend to use the camera for.
Preview: Provides a way to get the camera preview stream.
Image analysis: Provides a way to process camera data (frames).
Image capture: Provides a way to capture and save a photo.

In Google IO 2019 , Google added another powerfull tool for camera development in Android development called CameraX as part of Jetpack.

Few Features of CameraX,

It is backward compatible till Android 5.0 / Lollipop (API 21) and it works with atleast 90% devices in the market.
Under the hood , it uses and leverages the Camera 2 APIs. It basically provide same consistency like Camera 1 API via Camera 2 Legacy layer and it fixed a lot of issues accross the device.
It also has a lot of awesome advanced features like Portrait, HDR, Night mode etc (Provided your Device supports that).
CameraX has also introduced USECASES which allow you to focus on the task you need to get it done and not waste your time with specific devices.Few of them are Preview , Image Analysis, Image Capture.
CameraX doesn't have specific call/stop methods in onResume() and onPause() but it binds to lifecycle of the View with help of CameraX.bindToLifecycle()

![image](https://user-images.githubusercontent.com/39657409/65773346-c4b44c00-e159-11e9-8528-6495f4842694.png)
