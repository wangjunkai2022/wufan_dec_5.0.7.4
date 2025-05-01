.class final Lcom/kwad/sdk/h/m$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/h/l$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/sdk/h/m;->Ka()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic ayG:Ljava/util/List;


# direct methods
.method constructor <init>(Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/h/m$1;->ayG:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onSuccess()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/h/j;->JY()V

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/h/m$1;->ayG:Ljava/util/List;

    invoke-static {v0}, Lcom/kwad/sdk/h/m;->J(Ljava/util/List;)V

    return-void
.end method
