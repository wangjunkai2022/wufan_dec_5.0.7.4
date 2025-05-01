.class public final Lcom/join/kotlin/ui/userrecom/UserRecomendActivity$onCreate$2;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "UserRecomendActivity.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $FLIP_DISTANCE:I

.field final synthetic this$0:Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;


# direct methods
.method constructor <init>(ILcom/join/kotlin/ui/userrecom/UserRecomendActivity;)V
    .locals 0

    iput p1, p0, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity$onCreate$2;->$FLIP_DISTANCE:I

    iput-object p2, p0, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity$onCreate$2;->this$0:Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;

    .line 1
    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 1
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 1
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string p3, "e1"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "e2"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p3

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p4

    sub-float/2addr p3, p4

    iget p4, p0, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity$onCreate$2;->$FLIP_DISTANCE:I

    int-to-float p4, p4

    const/4 v0, 0x1

    cmpl-float p3, p3, p4

    if-gtz p3, :cond_2

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p4

    sub-float/2addr p3, p4

    iget p4, p0, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity$onCreate$2;->$FLIP_DISTANCE:I

    int-to-float p4, p4

    cmpl-float p3, p3, p4

    if-gtz p3, :cond_2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p3

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p4

    sub-float/2addr p3, p4

    iget p4, p0, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity$onCreate$2;->$FLIP_DISTANCE:I

    int-to-float p4, p4

    cmpl-float p3, p3, p4

    if-lez p3, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    sub-float/2addr p2, p1

    iget p1, p0, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity$onCreate$2;->$FLIP_DISTANCE:I

    int-to-float p1, p1

    cmpl-float p1, p2, p1

    if-lez p1, :cond_1

    return v0

    :cond_1
    const/4 p1, 0x0

    return p1

    .line 3
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity$onCreate$2;->this$0:Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return v0
.end method
