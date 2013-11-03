package com.espian.showcaseview.targets;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;

public class ViewTarget implements Target {

    private final View mView;

    public ViewTarget(View view) {
        mView = view;
    }

    public ViewTarget(int viewId, Activity activity) {
        mView = activity.findViewById(viewId);
    }

    @Override
    public Point getPoint() {
        return new Point((int) mView.getX(), (int) mView.getY());
    }
}
