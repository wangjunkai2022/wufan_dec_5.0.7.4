.class public final synthetic Lcom/join/mgps/activity/c3;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic b:Lcom/join/mgps/activity/SplashActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/activity/SplashActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/activity/c3;->b:Lcom/join/mgps/activity/SplashActivity;

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, Lcom/join/mgps/activity/c3;->b:Lcom/join/mgps/activity/SplashActivity;

    invoke-static {v0, p1, p2}, Lcom/join/mgps/activity/SplashActivity;->a(Lcom/join/mgps/activity/SplashActivity;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
