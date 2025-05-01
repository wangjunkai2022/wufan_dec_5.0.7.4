.class Lcom/beizi/ad/internal/network/c$1$1;
.super Lcom/beizi/ad/internal/utilities/HTTPGet;
.source "SharedNetworkManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/network/c$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/ad/internal/network/c$a;

.field final synthetic b:Lcom/beizi/ad/internal/network/c$1;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/network/c$1;ZZLcom/beizi/ad/internal/network/c$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/network/c$1$1;->b:Lcom/beizi/ad/internal/network/c$1;

    iput-object p4, p0, Lcom/beizi/ad/internal/network/c$1$1;->a:Lcom/beizi/ad/internal/network/c$a;

    invoke-direct {p0, p2, p3}, Lcom/beizi/ad/internal/utilities/HTTPGet;-><init>(ZZ)V

    return-void
.end method


# virtual methods
.method protected getUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/c$1$1;->a:Lcom/beizi/ad/internal/network/c$a;

    iget-object v0, v0, Lcom/beizi/ad/internal/network/c$a;->a:Ljava/lang/String;

    return-object v0
.end method

.method protected onPostExecute(Lcom/beizi/ad/internal/utilities/HTTPResponse;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/beizi/ad/internal/utilities/HTTPResponse;->getSucceeded()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/beizi/ad/internal/utilities/HTTPResponse;->getErrorCode()Lcom/beizi/ad/internal/utilities/HttpErrorCode;

    move-result-object p1

    sget-object v0, Lcom/beizi/ad/internal/utilities/HttpErrorCode;->CONNECTION_FAILURE:Lcom/beizi/ad/internal/utilities/HttpErrorCode;

    if-ne p1, v0, :cond_1

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/beizi/ad/internal/network/c$1$1;->a:Lcom/beizi/ad/internal/network/c$a;

    iget v0, p1, Lcom/beizi/ad/internal/network/c$a;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p1, Lcom/beizi/ad/internal/network/c$a;->b:I

    .line 4
    iget-object p1, p0, Lcom/beizi/ad/internal/network/c$1$1;->b:Lcom/beizi/ad/internal/network/c$1;

    iget-object p1, p1, Lcom/beizi/ad/internal/network/c$1;->b:Lcom/beizi/ad/internal/network/c;

    invoke-static {p1}, Lcom/beizi/ad/internal/network/c;->a(Lcom/beizi/ad/internal/network/c;)Ljava/util/ArrayList;

    move-result-object p1

    iget-object v0, p0, Lcom/beizi/ad/internal/network/c$1$1;->a:Lcom/beizi/ad/internal/network/c$a;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/beizi/ad/internal/utilities/HTTPResponse;

    invoke-virtual {p0, p1}, Lcom/beizi/ad/internal/network/c$1$1;->onPostExecute(Lcom/beizi/ad/internal/utilities/HTTPResponse;)V

    return-void
.end method
