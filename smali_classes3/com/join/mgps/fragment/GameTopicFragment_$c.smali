.class Lcom/join/mgps/fragment/GameTopicFragment_$c;
.super Ljava/lang/Object;
.source "GameTopicFragment_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/GameTopicFragment_;->showToast(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/join/mgps/fragment/GameTopicFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/GameTopicFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/GameTopicFragment_$c;->c:Lcom/join/mgps/fragment/GameTopicFragment_;

    iput-object p2, p0, Lcom/join/mgps/fragment/GameTopicFragment_$c;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/GameTopicFragment_$c;->c:Lcom/join/mgps/fragment/GameTopicFragment_;

    iget-object v1, p0, Lcom/join/mgps/fragment/GameTopicFragment_$c;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/join/mgps/fragment/GameTopicFragment_;->s0(Lcom/join/mgps/fragment/GameTopicFragment_;Ljava/lang/String;)V

    return-void
.end method
