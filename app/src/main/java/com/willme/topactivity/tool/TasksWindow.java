package com.willme.topactivity.tool;

import android.content.Context;
import android.os.Build;
import android.view.WindowManager;

import com.willme.topactivity.service.QuickSettingTileService;
import com.willme.topactivity.widget.FloatView;

public class TasksWindow {

    private static WindowManager.LayoutParams sWindowParams;
    private static WindowManager sWindowManager;
//    private static View sView;

//    public static void init(final Context context) {
//        sWindowManager = (WindowManager) context.getApplicationContext().getSystemService(Context.WINDOW_SERVICE);
//
//        sWindowParams = new WindowManager.LayoutParams(
//            WindowManager.LayoutParams.WRAP_CONTENT,
//            WindowManager.LayoutParams.WRAP_CONTENT,
//            Build.VERSION.SDK_INT <= Build.VERSION_CODES.N ? WindowManager.LayoutParams.TYPE_TOAST : WindowManager.LayoutParams.TYPE_PHONE, 0x18,
//            PixelFormat.TRANSLUCENT);
//
//        sWindowParams.gravity = Gravity.LEFT + Gravity.TOP;
//        sView = LayoutInflater.from(context).inflate(R.layout.window_tasks, null);
//    }

    public static void show(Context context, final String text) {
//        if (sWindowManager == null) {
//            init(context);
//        }
        FloatView.setText(text);
//        TextView textView = sView.findViewById(R.id.text);
//        textView.setText(text);
//        try {
//            sWindowManager.addView(sView, sWindowParams);
//        } catch (Exception e) {
//        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N)
            QuickSettingTileService.updateTile(context);
    }

    public static void dismiss(Context context) {
//        try {
//            sWindowManager.removeView(sView);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N)
            QuickSettingTileService.updateTile(context);
    }
}