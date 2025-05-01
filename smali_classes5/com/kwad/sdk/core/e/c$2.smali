.class final Lcom/kwad/sdk/core/e/c$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/e/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic sl:Ljava/lang/Throwable;


# direct methods
.method constructor <init>(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/core/e/c$2;->sl:Ljava/lang/Throwable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lcom/kwad/sdk/core/e/a/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/e/c$2;->sl:Ljava/lang/Throwable;

    invoke-interface {p1, v0}, Lcom/kwad/sdk/core/e/a/a;->printStackTraceOnly(Ljava/lang/Throwable;)V

    return-void
.end method
