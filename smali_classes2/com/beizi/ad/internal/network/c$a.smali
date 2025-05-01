.class Lcom/beizi/ad/internal/network/c$a;
.super Ljava/lang/Object;
.source "SharedNetworkManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/ad/internal/network/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field a:Ljava/lang/String;

.field b:I

.field final synthetic c:Lcom/beizi/ad/internal/network/c;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/network/c;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/network/c$a;->c:Lcom/beizi/ad/internal/network/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lcom/beizi/ad/internal/network/c$a;->a:Ljava/lang/String;

    const/4 p1, 0x0

    .line 3
    iput p1, p0, Lcom/beizi/ad/internal/network/c$a;->b:I

    return-void
.end method
