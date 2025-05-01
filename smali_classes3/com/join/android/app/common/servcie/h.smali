.class public final synthetic Lcom/join/android/app/common/servcie/h;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final synthetic b:Lcom/join/android/app/common/servcie/h;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/join/android/app/common/servcie/h;

    invoke-direct {v0}, Lcom/join/android/app/common/servcie/h;-><init>()V

    sput-object v0, Lcom/join/android/app/common/servcie/h;->b:Lcom/join/android/app/common/servcie/h;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lcom/join/android/app/common/servcie/DownloadBaseActivity;->k0(Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
