package me.gutierri.apps.restdesk;

import android.service.dreams.DreamService;
import android.util.Log;

public class ClockDreamService extends DreamService {

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setInteractive(false);
        setFullscreen(true);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onDreamingStopped() {
        super.onDreamingStopped();
        Log.d("ClockDreamServiceStop", "Stopped action DayDream Service");
    }
}
