package com.facebook.drawee.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public class GenericDraweeView extends DraweeView<com.facebook.drawee.generic.a> {
    public GenericDraweeView(Context context, com.facebook.drawee.generic.a aVar) {
        super(context);
        setHierarchy(aVar);
    }

    protected void inflateHierarchy(Context context, @Nullable AttributeSet attributeSet) {
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.a("GenericDraweeView#inflateHierarchy");
        }
        com.facebook.drawee.generic.b d5 = com.facebook.drawee.generic.c.d(context, attributeSet);
        setAspectRatio(d5.f());
        setHierarchy(d5.a());
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.c();
        }
    }

    public GenericDraweeView(Context context) {
        super(context);
        inflateHierarchy(context, null);
    }

    public GenericDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflateHierarchy(context, attributeSet);
    }

    public GenericDraweeView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        inflateHierarchy(context, attributeSet);
    }

    @TargetApi(21)
    public GenericDraweeView(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        inflateHierarchy(context, attributeSet);
    }
}
