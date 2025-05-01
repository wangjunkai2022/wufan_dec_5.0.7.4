.class public final synthetic Lcom/kotlin/base/data/net/a;
.super Ljava/lang/Object;

# interfaces
.implements Lokhttp3/Interceptor;


# static fields
.field public static final synthetic a:Lcom/kotlin/base/data/net/a;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/kotlin/base/data/net/a;

    invoke-direct {v0}, Lcom/kotlin/base/data/net/a;-><init>()V

    sput-object v0, Lcom/kotlin/base/data/net/a;->a:Lcom/kotlin/base/data/net/a;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final intercept(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
    .locals 0

    invoke-static {p1}, Lcom/kotlin/base/data/net/RetrofitFactory;->a(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;

    move-result-object p1

    return-object p1
.end method
