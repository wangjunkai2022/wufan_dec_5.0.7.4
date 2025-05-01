.class Lcom/join/mgps/rpc/n$b$a;
.super Lcom/fasterxml/jackson/core/type/TypeReference;
.source "RpcPapaPayClient.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/rpc/n$b;->a([Lcom/join/mgps/dto/PayGameDataRequest;)Lcom/join/mgps/dto/CommentResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/fasterxml/jackson/core/type/TypeReference<",
        "Lcom/join/mgps/dto/CommentResponse<",
        "Lcom/join/mgps/dto/PaygameResponse;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/rpc/n$b;


# direct methods
.method constructor <init>(Lcom/join/mgps/rpc/n$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/rpc/n$b$a;->b:Lcom/join/mgps/rpc/n$b;

    invoke-direct {p0}, Lcom/fasterxml/jackson/core/type/TypeReference;-><init>()V

    return-void
.end method
