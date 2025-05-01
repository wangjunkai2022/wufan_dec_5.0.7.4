.class final Lcom/kwad/sdk/api/loader/n$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/api/loader/n$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/sdk/api/loader/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/kwad/sdk/api/loader/n$f<",
        "Lcom/kwad/sdk/api/loader/a$a;",
        ">;"
    }
.end annotation


# instance fields
.field aoh:Lcom/kwad/sdk/api/loader/n$f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/kwad/sdk/api/loader/n$f<",
            "Lcom/kwad/sdk/api/loader/a$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/kwad/sdk/api/loader/n$f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kwad/sdk/api/loader/n$f<",
            "Lcom/kwad/sdk/api/loader/a$a;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kwad/sdk/api/loader/n$h;->aoh:Lcom/kwad/sdk/api/loader/n$f;

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/sdk/api/loader/v;Lcom/kwad/sdk/api/loader/n$c;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kwad/sdk/api/loader/v;",
            "Lcom/kwad/sdk/api/loader/n$c<",
            "Lcom/kwad/sdk/api/loader/a$a;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/api/loader/n$h;->aoh:Lcom/kwad/sdk/api/loader/n$f;

    new-instance v1, Lcom/kwad/sdk/api/loader/n$h$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/kwad/sdk/api/loader/n$h$1;-><init>(Lcom/kwad/sdk/api/loader/n$h;Lcom/kwad/sdk/api/loader/v;Lcom/kwad/sdk/api/loader/n$c;)V

    invoke-interface {v0, p1, v1}, Lcom/kwad/sdk/api/loader/n$f;->a(Lcom/kwad/sdk/api/loader/v;Lcom/kwad/sdk/api/loader/n$c;)V

    return-void
.end method
