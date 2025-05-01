.class final Lcom/kwad/sdk/j$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/service/a/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/sdk/j;->yP()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final rd()Z
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/components/core/p/b;->rc()Lcom/kwad/components/core/p/b;

    invoke-static {}, Lcom/kwad/components/core/p/b;->rd()Z

    move-result v0

    return v0
.end method

.method public final re()I
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/components/core/p/b;->rc()Lcom/kwad/components/core/p/b;

    invoke-static {}, Lcom/kwad/components/core/p/b;->re()I

    move-result v0

    return v0
.end method

.method public final rf()I
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/components/core/p/b;->rc()Lcom/kwad/components/core/p/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/core/p/b;->rf()I

    move-result v0

    return v0
.end method

.method public final wrapInputStream(Ljava/io/InputStream;)Ljava/io/InputStream;
    .locals 0

    .line 1
    invoke-static {}, Lcom/kwad/components/core/p/b;->rc()Lcom/kwad/components/core/p/b;

    invoke-static {p1}, Lcom/kwad/components/core/p/b;->wrapInputStream(Ljava/io/InputStream;)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method
