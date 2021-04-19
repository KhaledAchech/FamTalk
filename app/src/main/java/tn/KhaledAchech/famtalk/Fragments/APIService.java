package tn.KhaledAchech.famtalk.Fragments;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import tn.KhaledAchech.famtalk.Notifications.MyResponse;
import tn.KhaledAchech.famtalk.Notifications.Sender;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAM0VEpzg:APA91bHJlaczNWEPvfCDsgA2dLxN3FH9gGFaRI4gpZ3Oi8gcTYI2PxDRTN2vBPyNhbh8cgcwq5IroBg2TolHl0v_1oXSebP9F9jhWHUWHN9q0hFCUfyovh1XLGeev8DOTGZIF44uIZIm"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification (@Body Sender body);
}
