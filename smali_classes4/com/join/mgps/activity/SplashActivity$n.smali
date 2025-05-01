.class Lcom/join/mgps/activity/SplashActivity$n;
.super Ljava/lang/Object;
.source "SplashActivity.java"

# interfaces
.implements Lcom/nineoldandroids/animation/q$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/SplashActivity;->R()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/SplashActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/SplashActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/SplashActivity$n;->a:Lcom/join/mgps/activity/SplashActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Lcom/nineoldandroids/animation/q;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/nineoldandroids/animation/q;->K()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity$n;->a:Lcom/join/mgps/activity/SplashActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/SplashActivity;->o:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setTranslationY(F)V

    return-void
.end method
