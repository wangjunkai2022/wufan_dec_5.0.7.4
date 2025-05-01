.class public final Lcom/efs/sdk/net/a/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static a:Ljava/lang/String; = "callStart"

.field public static b:Ljava/lang/String; = "callEnd"

.field public static c:Ljava/lang/String; = "callFailed"

.field public static d:Ljava/lang/String; = "dnsStart"

.field public static e:Ljava/lang/String; = "dnsEnd"

.field public static f:Ljava/lang/String; = "connectStart"

.field public static g:Ljava/lang/String; = "secureConnectStart"

.field public static h:Ljava/lang/String; = "secureConnectEnd"

.field public static i:Ljava/lang/String; = "connectEnd"

.field public static j:Ljava/lang/String; = "connectFailed"

.field public static k:Ljava/lang/String; = "requestHeadersStart"

.field public static l:Ljava/lang/String; = "requestHeadersEnd"

.field public static m:Ljava/lang/String; = "requestBodyStart"

.field public static n:Ljava/lang/String; = "requestBodyEnd"

.field public static o:Ljava/lang/String; = "responseHeadersStart"

.field public static p:Ljava/lang/String; = "responseHeadersEnd"

.field public static q:Ljava/lang/String; = "responseBodyStart"

.field public static r:Ljava/lang/String; = "responseBodyEnd"

.field public static s:Ljava/lang/String; = "totalTime"

.field public static t:Ljava/lang/String; = "DNS"

.field public static u:Ljava/lang/String; = "secureConnect"

.field public static v:Ljava/lang/String; = "connect"

.field public static w:Ljava/lang/String; = "requestHeaders"

.field public static x:Ljava/lang/String; = "requestBody"

.field public static y:Ljava/lang/String; = "responseHeaders"

.field public static z:Ljava/lang/String; = "responseBody"


# instance fields
.field A:Ljava/lang/String;

.field public B:Ljava/lang/String;

.field public C:Ljava/lang/String;

.field D:J

.field public E:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public F:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/efs/sdk/net/a/d;->E:Ljava/util/Map;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/efs/sdk/net/a/d;->F:Ljava/util/Map;

    return-void
.end method
