.class Lcom/join/android/app/component/album/MyAlbumActivity$f;
.super Ljava/lang/Object;
.source "MyAlbumActivity.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/android/app/component/album/MyAlbumActivity;->L0(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/android/app/component/album/MyAlbumActivity;


# direct methods
.method constructor <init>(Lcom/join/android/app/component/album/MyAlbumActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/android/app/component/album/MyAlbumActivity$f;->b:Lcom/join/android/app/component/album/MyAlbumActivity;

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

    const-string p4, "android.permission.CAMERA"

    const/4 p5, 0x1

    if-ge p3, p5, :cond_0

    .line 1
    :try_start_0
    new-instance p1, Lcom/tbruyelle/rxpermissions2/c;

    iget-object p2, p0, Lcom/join/android/app/component/album/MyAlbumActivity$f;->b:Lcom/join/android/app/component/album/MyAlbumActivity;

    invoke-direct {p1, p2}, Lcom/tbruyelle/rxpermissions2/c;-><init>(Landroidx/fragment/app/FragmentActivity;)V

    .line 2
    filled-new-array {p4}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/tbruyelle/rxpermissions2/c;->r([Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance p2, Lcom/join/android/app/component/album/MyAlbumActivity$f$a;

    invoke-direct {p2, p0}, Lcom/join/android/app/component/album/MyAlbumActivity$f$a;-><init>(Lcom/join/android/app/component/album/MyAlbumActivity$f;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    .line 3
    iget-object p1, p0, Lcom/join/android/app/component/album/MyAlbumActivity$f;->b:Lcom/join/android/app/component/album/MyAlbumActivity;

    invoke-static {p1, p4}, Lcom/join/mgps/Util/UtilsMy;->L3(Landroid/app/Activity;Ljava/lang/String;)V
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
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/component/album/adapter/c;

    .line 6
    iget-object p4, p0, Lcom/join/android/app/component/album/MyAlbumActivity$f;->b:Lcom/join/android/app/component/album/MyAlbumActivity;

    invoke-virtual {p1, p3}, Lcom/join/android/app/component/album/adapter/c;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p4, p2, p1}, Lcom/join/android/app/component/album/MyAlbumActivity;->E0(Landroid/view/View;Ljava/lang/String;)V

    return-void
.end method
