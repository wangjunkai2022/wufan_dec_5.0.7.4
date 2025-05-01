.class public final synthetic Lcom/join/android/app/common/servcie/l;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic b:Lcom/join/android/app/common/servcie/DownloadService;


# direct methods
.method public synthetic constructor <init>(Lcom/join/android/app/common/servcie/DownloadService;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/android/app/common/servcie/l;->b:Lcom/join/android/app/common/servcie/DownloadService;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/join/android/app/common/servcie/l;->b:Lcom/join/android/app/common/servcie/DownloadService;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/join/android/app/common/servcie/DownloadService;->h(Lcom/join/android/app/common/servcie/DownloadService;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
