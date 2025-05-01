.class Lcom/join/android/app/component/album/MyIconActivity$f;
.super Ljava/lang/Object;
.source "MyIconActivity.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/android/app/component/album/MyIconActivity;->J0(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/android/app/component/album/MyIconActivity;


# direct methods
.method constructor <init>(Lcom/join/android/app/component/album/MyIconActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/android/app/component/album/MyIconActivity$f;->b:Lcom/join/android/app/component/album/MyIconActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    const-string p1, "android.permission.CAMERA"

    const/4 p2, 0x1

    if-ge p3, p2, :cond_0

    .line 1
    :try_start_0
    new-instance p2, Lcom/tbruyelle/rxpermissions2/c;

    iget-object p3, p0, Lcom/join/android/app/component/album/MyIconActivity$f;->b:Lcom/join/android/app/component/album/MyIconActivity;

    invoke-direct {p2, p3}, Lcom/tbruyelle/rxpermissions2/c;-><init>(Landroidx/fragment/app/FragmentActivity;)V

    .line 2
    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/tbruyelle/rxpermissions2/c;->r([Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p2

    new-instance p3, Lcom/join/android/app/component/album/MyIconActivity$f$a;

    invoke-direct {p3, p0}, Lcom/join/android/app/component/album/MyIconActivity$f$a;-><init>(Lcom/join/android/app/component/album/MyIconActivity$f;)V

    invoke-virtual {p2, p3}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    .line 3
    iget-object p2, p0, Lcom/join/android/app/component/album/MyIconActivity$f;->b:Lcom/join/android/app/component/album/MyIconActivity;

    invoke-static {p2, p1}, Lcom/join/mgps/Util/UtilsMy;->L3(Landroid/app/Activity;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/join/android/app/component/album/MyIconActivity$f;->b:Lcom/join/android/app/component/album/MyIconActivity;

    invoke-static {p1}, Lcom/join/android/app/component/album/MyIconActivity;->q0(Lcom/join/android/app/component/album/MyIconActivity;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/join/android/app/component/album/CropPicActivity_;->u0(Landroid/content/Context;)Lcom/join/android/app/component/album/CropPicActivity_$k;

    move-result-object p1

    iget-object p2, p0, Lcom/join/android/app/component/album/MyIconActivity$f;->b:Lcom/join/android/app/component/album/MyIconActivity;

    invoke-static {p2}, Lcom/join/android/app/component/album/MyIconActivity;->p0(Lcom/join/android/app/component/album/MyIconActivity;)Lcom/join/android/app/component/album/adapter/d;

    move-result-object p2

    invoke-virtual {p2, p3}, Lcom/join/android/app/component/album/adapter/d;->getItem(I)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/join/android/app/component/album/CropPicActivity_$k;->a(Ljava/lang/String;)Lcom/join/android/app/component/album/CropPicActivity_$k;

    move-result-object p1

    iget-object p2, p0, Lcom/join/android/app/component/album/MyIconActivity$f;->b:Lcom/join/android/app/component/album/MyIconActivity;

    invoke-static {p2}, Lcom/join/android/app/component/album/MyIconActivity;->o0(Lcom/join/android/app/component/album/MyIconActivity;)I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/join/android/app/component/album/CropPicActivity_$k;->b(I)Lcom/join/android/app/component/album/CropPicActivity_$k;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method
