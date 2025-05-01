.class public Lcom/kwad/sdk/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/framework/filedownloader/f/c$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/sdk/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private volatile alI:Lokhttp3/OkHttpClient;

.field private alM:Lokhttp3/OkHttpClient$Builder;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 3
    invoke-static {}, Lcom/kwad/sdk/k;->zH()Lokhttp3/OkHttpClient$Builder;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/k$a;->alM:Lokhttp3/OkHttpClient$Builder;

    return-void

    .line 4
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/k;->zI()Lokhttp3/OkHttpClient$Builder;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/k$a;->alM:Lokhttp3/OkHttpClient$Builder;

    return-void
.end method


# virtual methods
.method public final bh(Ljava/lang/String;)Lcom/kwad/framework/filedownloader/a/b;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/k$a;->alI:Lokhttp3/OkHttpClient;

    if-nez v0, :cond_2

    .line 2
    const-class v0, Lcom/kwad/sdk/k$a;

    monitor-enter v0

    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/kwad/sdk/k$a;->alI:Lokhttp3/OkHttpClient;

    if-nez v1, :cond_1

    .line 4
    iget-object v1, p0, Lcom/kwad/sdk/k$a;->alM:Lokhttp3/OkHttpClient$Builder;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object v1

    goto :goto_0

    :cond_0
    new-instance v1, Lokhttp3/OkHttpClient;

    invoke-direct {v1}, Lokhttp3/OkHttpClient;-><init>()V

    :goto_0
    iput-object v1, p0, Lcom/kwad/sdk/k$a;->alI:Lokhttp3/OkHttpClient;

    const/4 v1, 0x0

    .line 5
    iput-object v1, p0, Lcom/kwad/sdk/k$a;->alM:Lokhttp3/OkHttpClient$Builder;

    .line 6
    :cond_1
    monitor-exit v0

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 7
    :cond_2
    :goto_1
    new-instance v0, Lcom/kwad/sdk/k;

    iget-object v1, p0, Lcom/kwad/sdk/k$a;->alI:Lokhttp3/OkHttpClient;

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, v2}, Lcom/kwad/sdk/k;-><init>(Ljava/lang/String;Lokhttp3/OkHttpClient;B)V

    return-object v0
.end method
