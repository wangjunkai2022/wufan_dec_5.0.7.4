.class final Lcom/umeng/pagesdk/d$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/umeng/pagesdk/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/umeng/pagesdk/d;->a(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lorg/json/JSONObject;


# direct methods
.method constructor <init>(Lorg/json/JSONObject;)V
    .locals 0

    iput-object p1, p0, Lcom/umeng/pagesdk/d$1;->a:Lorg/json/JSONObject;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/umeng/pagesdk/a;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/umeng/pagesdk/d$1;->a:Lorg/json/JSONObject;

    const-string v1, "te"

    iget v2, p1, Lcom/umeng/pagesdk/a;->c:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    iget-object v0, p0, Lcom/umeng/pagesdk/d$1;->a:Lorg/json/JSONObject;

    const-string v1, "le"

    iget p1, p1, Lcom/umeng/pagesdk/a;->a:I

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    new-instance p1, Lcom/efs/sdk/base/protocol/record/EfsJSONLog;

    const-string v0, "pageperf"

    invoke-direct {p1, v0}, Lcom/efs/sdk/base/protocol/record/EfsJSONLog;-><init>(Ljava/lang/String;)V

    const-string v0, "page"

    iget-object v1, p0, Lcom/umeng/pagesdk/d$1;->a:Lorg/json/JSONObject;

    invoke-virtual {p1, v0, v1}, Lcom/efs/sdk/base/protocol/record/AbsRecordLog;->put(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Lcom/umeng/pagesdk/PageManger;->getReporter()Lcom/efs/sdk/base/EfsReporter;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/efs/sdk/base/EfsReporter;->send(Lcom/efs/sdk/base/protocol/ILogProtocol;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    return-void
.end method
