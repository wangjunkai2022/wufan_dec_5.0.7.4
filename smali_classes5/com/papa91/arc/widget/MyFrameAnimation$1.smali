.class Lcom/papa91/arc/widget/MyFrameAnimation$1;
.super Ljava/lang/Object;
.source "MyFrameAnimation.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/papa91/arc/widget/MyFrameAnimation;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/papa91/arc/widget/MyFrameAnimation;


# direct methods
.method constructor <init>(Lcom/papa91/arc/widget/MyFrameAnimation;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa91/arc/widget/MyFrameAnimation$1;->this$0:Lcom/papa91/arc/widget/MyFrameAnimation;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/widget/MyFrameAnimation$1;->this$0:Lcom/papa91/arc/widget/MyFrameAnimation;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->getNumberOfFrames()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/AnimationDrawable;->getFrame(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget-object v1, p0, Lcom/papa91/arc/widget/MyFrameAnimation$1;->this$0:Lcom/papa91/arc/widget/MyFrameAnimation;

    invoke-virtual {v1}, Landroid/graphics/drawable/AnimationDrawable;->getCurrent()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/papa91/arc/widget/MyFrameAnimation$1;->this$0:Lcom/papa91/arc/widget/MyFrameAnimation;

    invoke-static {v0}, Lcom/papa91/arc/widget/MyFrameAnimation;->access$000(Lcom/papa91/arc/widget/MyFrameAnimation;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/papa91/arc/widget/MyFrameAnimation$1;->this$0:Lcom/papa91/arc/widget/MyFrameAnimation;

    invoke-static {v0}, Lcom/papa91/arc/widget/MyFrameAnimation;->access$100(Lcom/papa91/arc/widget/MyFrameAnimation;)V

    :goto_0
    return-void
.end method
