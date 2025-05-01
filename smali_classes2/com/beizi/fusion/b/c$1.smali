.class Lcom/beizi/fusion/b/c$1;
.super Ljava/lang/Object;
.source "EventCar.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/b/c;->a(Lcom/beizi/fusion/b/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/b/b;

.field final synthetic b:Lcom/beizi/fusion/b/c;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/b/c;Lcom/beizi/fusion/b/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/b/c$1;->b:Lcom/beizi/fusion/b/c;

    iput-object p2, p0, Lcom/beizi/fusion/b/c$1;->a:Lcom/beizi/fusion/b/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/b/c$1;->b:Lcom/beizi/fusion/b/c;

    iget-object v1, p0, Lcom/beizi/fusion/b/c$1;->a:Lcom/beizi/fusion/b/b;

    invoke-static {v0, v1}, Lcom/beizi/fusion/b/c;->a(Lcom/beizi/fusion/b/c;Lcom/beizi/fusion/b/b;)V

    return-void
.end method
