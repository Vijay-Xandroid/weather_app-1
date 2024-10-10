package com.vita.weatherforecast.utils.extension;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u001a\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\f\u001a\n\u0010\r\u001a\u00020\u000e*\u00020\u000f\u001a\u0012\u0010\u0010\u001a\u00020\u000e*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0007\u001a\u001c\u0010\u0013\u001a\u00020\u000e*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u0005\u00a8\u0006\u0017"}, d2 = {"getDateTime", "Ljava/time/DayOfWeek;", "s", "", "logTrace", "", "text", "", "runOnMain", "Lkotlinx/coroutines/Job;", "T", "block", "Lkotlin/Function0;", "hideKeyboard", "", "Landroid/view/View;", "shortToast", "Landroid/content/Context;", "msg", "showSnack", "Landroidx/fragment/app/Fragment;", "message", "duration", "app_debug"})
public final class AndroidExtensionKt {
    
    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Object>kotlinx.coroutines.Job runOnMain(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<? extends T> block) {
        return null;
    }
    
    public static final int logTrace(@org.jetbrains.annotations.NotNull
    java.lang.String text) {
        return 0;
    }
    
    public static final void showSnack(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment $this$showSnack, @org.jetbrains.annotations.NotNull
    java.lang.String message, int duration) {
    }
    
    public static final void shortToast(@org.jetbrains.annotations.NotNull
    android.content.Context $this$shortToast, @org.jetbrains.annotations.NotNull
    java.lang.String msg) {
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public static final java.time.DayOfWeek getDateTime(long s) {
        return null;
    }
    
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull
    android.view.View $this$hideKeyboard) {
    }
}