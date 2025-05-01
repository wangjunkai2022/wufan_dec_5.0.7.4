.class Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2$a;
.super Ljava/lang/Object;
.source "ConsecutiveViewPager2.java"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;",
            ">;"
        }
    .end annotation
.end field

.field c:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2$a;->b:Ljava/lang/ref/WeakReference;

    .line 3
    iput-object p2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2$a;->c:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2$a;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2$a;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;

    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2$a;->c:Landroid/view/View;

    invoke-static {p1, v0}, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;->a(Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method
