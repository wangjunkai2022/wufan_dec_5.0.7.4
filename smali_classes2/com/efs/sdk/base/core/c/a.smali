.class public final Lcom/efs/sdk/base/core/c/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/efs/sdk/base/core/c/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/efs/sdk/base/core/d/b;Z)Lcom/efs/sdk/base/http/HttpResponse;
    .locals 8
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-static {}, Lcom/efs/sdk/base/core/a/c;->a()Lcom/efs/sdk/base/core/a/c;

    move-result-object v0

    .line 2
    iget-object v1, p1, Lcom/efs/sdk/base/core/d/b;->a:Lcom/efs/sdk/base/core/d/a;

    iget-object v2, v1, Lcom/efs/sdk/base/core/d/a;->d:Ljava/lang/String;

    .line 3
    iput-object v2, v0, Lcom/efs/sdk/base/core/a/c;->d:Ljava/lang/String;

    .line 4
    iget v2, v1, Lcom/efs/sdk/base/core/d/a;->e:I

    .line 5
    iput v2, v0, Lcom/efs/sdk/base/core/a/c;->e:I

    .line 6
    iget-byte v2, v1, Lcom/efs/sdk/base/core/d/a;->b:B

    .line 7
    iput-byte v2, v0, Lcom/efs/sdk/base/core/a/c;->g:B

    .line 8
    iget-object v1, v1, Lcom/efs/sdk/base/core/d/a;->a:Ljava/lang/String;

    .line 9
    iput-object v1, v0, Lcom/efs/sdk/base/core/a/c;->h:Ljava/lang/String;

    .line 10
    invoke-virtual {p1}, Lcom/efs/sdk/base/core/d/b;->a()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/efs/sdk/base/core/a/c;->m:J

    .line 11
    invoke-static {}, Lcom/efs/sdk/base/core/config/a/c;->a()Lcom/efs/sdk/base/core/config/a/c;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/efs/sdk/base/core/config/a/c;->a(Z)Ljava/lang/String;

    move-result-object v1

    .line 12
    iget-object v2, p1, Lcom/efs/sdk/base/core/d/b;->a:Lcom/efs/sdk/base/core/d/a;

    iget v2, v2, Lcom/efs/sdk/base/core/d/a;->c:I

    const/4 v3, 0x1

    if-nez v2, :cond_1

    .line 13
    invoke-static {}, Lcom/efs/sdk/base/core/a/a;->a()Lcom/efs/sdk/base/core/a/a;

    move-result-object v2

    .line 14
    iget-object v4, p1, Lcom/efs/sdk/base/core/d/b;->c:[B

    .line 15
    iget-object v5, p1, Lcom/efs/sdk/base/core/d/b;->b:Lcom/efs/sdk/base/core/d/c;

    iget-boolean v5, v5, Lcom/efs/sdk/base/core/d/c;->b:Z

    .line 16
    invoke-virtual {v0}, Lcom/efs/sdk/base/core/a/c;->b()Ljava/lang/String;

    move-result-object v6

    .line 17
    invoke-static {v1, v0}, Lcom/efs/sdk/base/core/a/a;->a(Ljava/lang/String;Lcom/efs/sdk/base/core/a/c;)Ljava/lang/String;

    move-result-object v1

    .line 18
    iget-boolean v2, v2, Lcom/efs/sdk/base/core/a/a;->a:Z

    if-eqz v2, :cond_0

    .line 19
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v7, "upload buffer file, url is "

    invoke-virtual {v7, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v7, "efs.px.api"

    invoke-static {v7, v2}, Lcom/efs/sdk/base/core/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    :cond_0
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2, v3}, Ljava/util/HashMap;-><init>(I)V

    const-string v7, "wpk-header"

    .line 21
    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    new-instance v6, Lcom/efs/sdk/base/core/util/a/d;

    invoke-direct {v6, v1}, Lcom/efs/sdk/base/core/util/a/d;-><init>(Ljava/lang/String;)V

    .line 23
    invoke-virtual {v6, v2}, Lcom/efs/sdk/base/core/util/a/d;->a(Ljava/util/Map;)Lcom/efs/sdk/base/core/util/a/d;

    move-result-object v1

    .line 24
    iget-object v2, v1, Lcom/efs/sdk/base/core/util/a/d;->a:Lcom/efs/sdk/base/core/util/a/b;

    iput-object v4, v2, Lcom/efs/sdk/base/core/util/a/b;->c:[B

    .line 25
    iput-boolean v3, v2, Lcom/efs/sdk/base/core/util/a/b;->g:Z

    .line 26
    iget-object v2, v0, Lcom/efs/sdk/base/core/a/c;->h:Ljava/lang/String;

    const-string v3, "type"

    .line 27
    invoke-virtual {v1, v3, v2}, Lcom/efs/sdk/base/core/util/a/d;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/efs/sdk/base/core/util/a/d;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, v0, Lcom/efs/sdk/base/core/a/c;->m:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "size"

    .line 28
    invoke-virtual {v1, v2, v0}, Lcom/efs/sdk/base/core/util/a/d;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/efs/sdk/base/core/util/a/d;

    move-result-object v0

    .line 29
    invoke-static {v5}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v1

    const-string v2, "flow_limit"

    invoke-virtual {v0, v2, v1}, Lcom/efs/sdk/base/core/util/a/d;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/efs/sdk/base/core/util/a/d;

    move-result-object v0

    .line 30
    invoke-static {}, Lcom/efs/sdk/base/core/a/d;->a()Lcom/efs/sdk/base/core/a/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/efs/sdk/base/core/util/a/d;->a(Lcom/efs/sdk/base/http/AbsHttpListener;)Lcom/efs/sdk/base/core/util/a/d;

    move-result-object v0

    .line 31
    invoke-virtual {v0}, Lcom/efs/sdk/base/core/util/a/d;->a()Lcom/efs/sdk/base/core/util/a/c;

    move-result-object v0

    .line 32
    invoke-virtual {v0}, Lcom/efs/sdk/base/core/util/a/c;->b()Lcom/efs/sdk/base/http/HttpResponse;

    move-result-object v0

    goto :goto_0

    :cond_1
    if-ne v3, v2, :cond_2

    .line 33
    invoke-static {}, Lcom/efs/sdk/base/core/a/a;->a()Lcom/efs/sdk/base/core/a/a;

    move-result-object v2

    .line 34
    iget-object v3, p1, Lcom/efs/sdk/base/core/d/b;->d:Ljava/io/File;

    .line 35
    iget-object v4, p1, Lcom/efs/sdk/base/core/d/b;->b:Lcom/efs/sdk/base/core/d/c;

    iget-boolean v4, v4, Lcom/efs/sdk/base/core/d/c;->b:Z

    .line 36
    invoke-virtual {v2, v1, v0, v3, v4}, Lcom/efs/sdk/base/core/a/a;->a(Ljava/lang/String;Lcom/efs/sdk/base/core/a/c;Ljava/io/File;Z)Lcom/efs/sdk/base/http/HttpResponse;

    move-result-object v0

    goto :goto_0

    .line 37
    :cond_2
    new-instance v0, Lcom/efs/sdk/base/http/HttpResponse;

    invoke-direct {v0}, Lcom/efs/sdk/base/http/HttpResponse;-><init>()V

    .line 38
    :goto_0
    iget-boolean v1, v0, Lcom/efs/sdk/base/core/d/d;->succ:Z

    if-eqz v1, :cond_3

    if-eqz p2, :cond_3

    .line 39
    iget-object p1, p1, Lcom/efs/sdk/base/core/d/b;->d:Ljava/io/File;

    .line 40
    invoke-static {p1}, Lcom/efs/sdk/base/core/util/b;->b(Ljava/io/File;)V

    :cond_3
    return-object v0
.end method
