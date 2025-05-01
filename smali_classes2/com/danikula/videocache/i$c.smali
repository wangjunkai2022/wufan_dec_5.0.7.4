.class final Lcom/danikula/videocache/i$c;
.super Ljava/lang/Object;
.source "HttpProxyCacheServer.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/danikula/videocache/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field private final b:Ljava/net/Socket;

.field final synthetic c:Lcom/danikula/videocache/i;


# direct methods
.method public constructor <init>(Lcom/danikula/videocache/i;Ljava/net/Socket;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/danikula/videocache/i$c;->c:Lcom/danikula/videocache/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lcom/danikula/videocache/i$c;->b:Ljava/net/Socket;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/danikula/videocache/i$c;->c:Lcom/danikula/videocache/i;

    iget-object v1, p0, Lcom/danikula/videocache/i$c;->b:Ljava/net/Socket;

    invoke-static {v0, v1}, Lcom/danikula/videocache/i;->b(Lcom/danikula/videocache/i;Ljava/net/Socket;)V

    return-void
.end method
