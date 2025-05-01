.class Lcom/beizi/fusion/g/i$2$1;
.super Ljava/lang/Object;
.source "BeiZiImageUtils.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/g/i$2;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/g/i$2;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/g/i$2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/g/i$2$1;->a:Lcom/beizi/fusion/g/i$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/g/i$2$1;->a:Lcom/beizi/fusion/g/i$2;

    iget-object v0, v0, Lcom/beizi/fusion/g/i$2;->b:Lcom/beizi/fusion/g/i$a;

    invoke-interface {v0}, Lcom/beizi/fusion/g/i$a;->a()V

    return-void
.end method
