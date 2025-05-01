.class public Lcom/aggmoread/sdk/b/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/c/a/a/d/a/c;


# instance fields
.field private a:Lcom/aggmoread/sdk/client/AMAdDownloadConfirmListener;


# direct methods
.method public constructor <init>(Lcom/aggmoread/sdk/client/AMAdDownloadConfirmListener;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/aggmoread/sdk/b/b;->a:Lcom/aggmoread/sdk/client/AMAdDownloadConfirmListener;

    return-void
.end method


# virtual methods
.method public a(Landroid/app/Activity;ILcom/aggmoread/sdk/z/c/a/a/d/a/c$b;)V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/b/b;->a:Lcom/aggmoread/sdk/client/AMAdDownloadConfirmListener;

    new-instance v1, Lcom/aggmoread/sdk/b/b$a;

    invoke-direct {v1, p0, p3}, Lcom/aggmoread/sdk/b/b$a;-><init>(Lcom/aggmoread/sdk/b/b;Lcom/aggmoread/sdk/z/c/a/a/d/a/c$b;)V

    invoke-interface {v0, p1, p2, v1}, Lcom/aggmoread/sdk/client/AMAdDownloadConfirmListener;->onDownloadConfirm(Landroid/app/Activity;ILcom/aggmoread/sdk/client/AMAdDownloadConfirmListener$Controller;)V

    return-void
.end method
