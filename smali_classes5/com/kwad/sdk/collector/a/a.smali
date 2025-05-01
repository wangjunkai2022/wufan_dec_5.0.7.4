.class public final Lcom/kwad/sdk/collector/a/a;
.super Lcom/kwad/sdk/core/network/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/sdk/collector/a/a$a;
    }
.end annotation


# instance fields
.field private aoI:Lcom/kwad/sdk/collector/a/a$a;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/network/d;-><init>()V

    .line 2
    new-instance v0, Lcom/kwad/sdk/collector/a/a$a;

    invoke-direct {v0, p1}, Lcom/kwad/sdk/collector/a/a$a;-><init>(Ljava/util/List;)V

    iput-object v0, p0, Lcom/kwad/sdk/collector/a/a;->aoI:Lcom/kwad/sdk/collector/a/a$a;

    .line 3
    invoke-virtual {v0}, Lcom/kwad/sdk/collector/a/a$a;->toJson()Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "targetAppInfo"

    .line 4
    invoke-virtual {p0, v0, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;Lorg/json/JSONObject;)V

    const-string p1, "sdkVersion"

    const-string v0, "3.3.63"

    .line 5
    invoke-virtual {p0, p1, v0}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "sdkVersionCode"

    const v0, 0x2e548c

    .line 6
    invoke-virtual {p0, p1, v0}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final getUrl()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/h;->yJ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
