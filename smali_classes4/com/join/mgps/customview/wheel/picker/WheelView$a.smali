.class Lcom/join/mgps/customview/wheel/picker/WheelView$a;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "WheelView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/customview/wheel/picker/WheelView;->s(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/customview/wheel/picker/WheelView;


# direct methods
.method constructor <init>(Lcom/join/mgps/customview/wheel/picker/WheelView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$a;->b:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$a;->b:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-static {p1, p4}, Lcom/join/mgps/customview/wheel/picker/WheelView;->a(Lcom/join/mgps/customview/wheel/picker/WheelView;F)V

    const/4 p1, 0x1

    return p1
.end method
