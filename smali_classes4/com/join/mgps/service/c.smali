.class public final synthetic Lcom/join/mgps/service/c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final synthetic b:Lcom/join/mgps/service/c;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/join/mgps/service/c;

    invoke-direct {v0}, Lcom/join/mgps/service/c;-><init>()V

    sput-object v0, Lcom/join/mgps/service/c;->b:Lcom/join/mgps/service/c;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 0

    invoke-static {}, Lcom/join/mgps/service/CommonService;->c()V

    return-void
.end method
