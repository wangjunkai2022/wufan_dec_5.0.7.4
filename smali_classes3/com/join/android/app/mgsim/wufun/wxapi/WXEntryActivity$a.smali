.class Lcom/join/android/app/mgsim/wufun/wxapi/WXEntryActivity$a;
.super Ljava/lang/Object;
.source "WXEntryActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/android/app/mgsim/wufun/wxapi/WXEntryActivity;->onShowMessageFromWXReq(Lcn/sharesdk/wechat/utils/WXMediaMessage;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/Util/IntentDateBean;

.field final synthetic c:Lcom/join/android/app/mgsim/wufun/wxapi/WXEntryActivity;


# direct methods
.method constructor <init>(Lcom/join/android/app/mgsim/wufun/wxapi/WXEntryActivity;Lcom/join/mgps/Util/IntentDateBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/android/app/mgsim/wufun/wxapi/WXEntryActivity$a;->c:Lcom/join/android/app/mgsim/wufun/wxapi/WXEntryActivity;

    iput-object p2, p0, Lcom/join/android/app/mgsim/wufun/wxapi/WXEntryActivity$a;->b:Lcom/join/mgps/Util/IntentDateBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/android/app/mgsim/wufun/wxapi/WXEntryActivity$a;->c:Lcom/join/android/app/mgsim/wufun/wxapi/WXEntryActivity;

    iget-object v2, p0, Lcom/join/android/app/mgsim/wufun/wxapi/WXEntryActivity$a;->b:Lcom/join/mgps/Util/IntentDateBean;

    const/high16 v3, 0x24000000

    invoke-virtual {v0, v1, v2, v3}, Lcom/join/mgps/Util/IntentUtil;->checkAndStartMain(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;I)V

    return-void
.end method
